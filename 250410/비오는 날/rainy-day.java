import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Data[] data = new Data[n];
        for(int i = 0; i < n; i++){
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            data[i] = new Data(a,b,c);
        }

        int k = 0;
        for(int i = 1; i < n; i++){
            if(data[i].date.compareTo(data[k].date) < 0){
                k = i;
            }
        }

        int count = 0;
        for(int i = k; i < n; i++){
            if(data[i].weather.equals("Rain")){
                count = i;
                break;
            }
        }

        data[count].InfoPrint();
    }
}

class Data{
    public String date;
    public String day;
    public String weather;

    public Data(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public void InfoPrint(){
        System.out.println(date + " " + day + " " + weather);
    }
}