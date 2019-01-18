public class Team {
    private Coach head;
    private Coach assistant;
    private Player player;
    private Player subsititutes;
    private String color;
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public Coach getHead() {
        return head;
    }

    public void setHead(Coach head) {
        this.head = head;
    }

    public Coach getAssistant() {
        return assistant;
    }

    public void setAssistant(Coach assistant) {
        this.assistant = assistant;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getSubsititutes() {
        return subsititutes;
    }

    public void setSubsititutes(Player subsititutes) {
        this.subsititutes = subsititutes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
