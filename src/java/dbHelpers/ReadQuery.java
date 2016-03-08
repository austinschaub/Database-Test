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

public class ReadQuery {

    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
        
    Properties props = new Properties(); 
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead(){
        
        try {
            String query = "Select * from teams";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public String getHTMLTable(){
        
        String table = "";
        
        table += "<table>";
        
        
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
                table += "<a href=delete?trackID=" + team.getTrackID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        table += "</table>";
     
                return table;
       
    }
    
       

}
