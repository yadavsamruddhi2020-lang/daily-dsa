class computer{
    public void playmusic(){
        System.out.println("music playing");
    }
    public String getmepen(int cost){
        if(cost>=10)
            return "pen";
        else
            return "nothing";
    }
}


public class methods {
    public static void main(String[] args) {
        computer obj = new computer();
        obj.playmusic();
        System.out.println(obj.getmepen(100));
    }
}
