package paper;

public class paper {
    private String code;
    private String title;
    private int points;

    public paper(String code, String title, int points) {
        // Should check the values here.
        // Could you re-use the getters to do that?
        this.code = code;
        this.title = title;
        this.points = points;
        }

    public boolean setPoints(int newPointsValue) {
        if (newPointsValue < 0) {
            return false;
        } else {
            this.points = newPointsValue;
            return true;
        }
    }

    public int getPoints() {
        return this.points;
    }

    public boolean setTitle(String titleValue){
        if(titleValue.length() < 0){
            return false;
        } else{
            this.title = titleValue;
            return true;
        }
    }

    public String getTitle() {
        return this.title;
    }

    public boolean setCode(String codeValue){
            if(codeValue.length() < 0){
                return false;
            } else{
                this.code = codeValue;
                return true;
            }
        }

    public String getCode() {
        return this.code;
    };

}

