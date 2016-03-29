
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Teams;


public class UpdateQuery {
    
    private Connection conn;
    
    
    public UpdateQuery(){
        
        Properties props = new Properties(); 
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
    }
    
    
    public void doUpdate (Teams team){
        
        try {
        String query = "UPDATE teams SET teamName = ?, teamState = ?, champions = ?, league =? WHERE trackID = ?";
        
        PreparedStatement ps = conn.prepareStatement(query);

        ps.setString(1, team.getTeamName());
        ps.setString(2, team.getTeamState());
        ps.setInt(3, team.getChampions());
        ps.setString(4, team.getLeague());
        ps.setInt(5, team.getTrackID());
 
        ps.executeUpdate();
    }catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
