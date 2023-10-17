class year{
    int days;
    year(int days){
        this.days=days;
    }
    year(){

    }

    int getDays(){
        return days;
    }
}

class leapyear extends year{
    leapyear(int days){
        super(365);
        if (days==366){
            return;
    }
    this.days=days;
    }


}

public class UseYear {
    public static void main(String[] args) {
        leapyear ly=new leapyear(366);

    }
}
