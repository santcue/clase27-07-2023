package encapsulation;

public class Sum {
    private int numb1;
    private int numb2;

    public int getNumb1() {
        return numb1;
    }

    public void setNumb1(int numb1) {
        this.numb1 = numb1;
    }

    public int getNumb2() {
        return numb2;
    }

    public void setNumb2(int numb2) {
        this.numb2 = numb2;
    }

    public int sum(){
        return numb1+numb2;
    }
}

