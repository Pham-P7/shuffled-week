import java.util.*;
public class wDs {
    public static void main(String args[]){
        String arr[] = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        Collections.shuffle(Arrays.asList(arr));
        arr[0]="monday";arr[1]="tuesday";arr[2]="wedsnesday";arr[3]="thursday";arr[4]="friday";arr[5]="saturday";arr[6]="sunday";
        System.out.print(String.join(" ",arr));
    }
}