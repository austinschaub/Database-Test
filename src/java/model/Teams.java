
package model;

public class Teams {
    
    private int trackID;
    private String teamName;
    private String teamState;
    private int champions;
    private String league;

    public Teams() {
        this.trackID = 0;
        this.teamName = "";
        this.teamState = "";
        this.champions = 0;
        this.league = "";
    }
    
    public Teams(int trackID, String teamName, String teamState, int champions, String league) {
        this.trackID = trackID;
        this.teamName = teamName;
        this.teamState = teamState;
        this.champions = champions;
        this.league = league;
    }

    public int getTrackID() {
        return trackID;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamState() {
        return teamState;
    }

    public void setTeamState(String teamState) {
        this.teamState = teamState;
    }

    public int getChampions() {
        return champions;
    }

    public void setChampions(int champions) {
        this.champions = champions;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return "Teams{" + "trackID=" + trackID + ", teamName=" + teamName + ", teamState=" + teamState + ", champions=" + champions + ", league=" + league + '}';
    }
    
    
    
    
    
    
}
