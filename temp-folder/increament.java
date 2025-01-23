public class increament {
    public static void main(String[] args){
        int num=7;

        //++num; //pre increment
        //num++; //post increment
        //int result=++num;  //increament first then fetch result=8
        int result = num++; //first fetch then increament result=7
        System.out.println(result);
    }
}
