
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Teams;


public class SearchQuery {
    
    
    private Connection conn;
    private ResultSet results;
    
    public SearchQuery(){
        
    Properties props = new Properties(); 
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void doSearch (String teamName){
        
        try {
            String query = "SELECT * FROM teams WHERE UPPER (teamName) LIKE ? ODER BY trackID ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + teamName.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getHTMLTable(){
        
        String table = "";
        
        table += "<table>";
        
        table += "<tr>";
                table += "<th>Team ID</th>";
                table += "<th>Team Name</th>";
                table += "<th>Team State</th>";
                table += "<th>Championships Won</th>";
                table += "<th>Leauge</th>";
                table += "<th>Delete/Update</th>";
                
        
        
        
        try {
            while(this.results.next()){
                
                Teams team = new Teams();
                
                team.setTrackID(this.results.getInt("trackID"));
                team.setTeamName(this.results.getString("teamName"));
                team.setTeamState(this.results.getString("teamState"));
                team.setChampions(this.results.getInt("champions"));
                team.setLeague(this.results.getString("league"));
                
                table += "<tr>";
                
                table += "<td>";
                table += team.getTrackID();
                table += "</td>";
                
                table += "<td>";
                table += team.getTeamName();
                table += "</td>";
                
                table += "<td>";
                table += team.getTeamState();
                table += "</td>";
                
                table += "<td>";
                table += team.getChampions();
                table += "</td>";
                
                table += "<td>";
                table += team.getLeague();
                table += "</td>";
                
                table += "<td>";
                table += "<a href=update?trackID=" + team.getTrackID() + "> Update </a>" + "<a href=delete?trackID=" + team.getTrackID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        table += "</table>";
     
                return table;
    
    }
    
    
}

