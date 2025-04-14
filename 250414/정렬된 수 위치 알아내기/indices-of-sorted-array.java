import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Sequence[] sequences = new Sequence[n];

        for(int i = 0; i < n; i++){
            int num = sc.nextInt();

            sequences[i] = new Sequence(num, i + 1);
        }

        Arrays.sort(sequences, new Comparator<Sequence>(){
            @Override
            public int compare(Sequence s1, Sequence s2){
                if(s1.number == s2.number){
                    return s1.firstIndex - s2.firstIndex;
                }
                return s1.number - s2.number;
            }
        });

        // for(Sequence s : sequences){
        //     System.out.print(s.firstIndex + " ");
        // }

        for(int i = 0; i < n; i++){
            sequences[i].secondIndex = i + 1;
        }

        // for(Sequence s : sequences){
        //     System.out.print(s.secondIndex + " ");
        // }

        Arrays.sort(sequences, new Comparator<Sequence>(){
            @Override
            public int compare(Sequence s1, Sequence s2){
                return s1.firstIndex - s2.firstIndex;
            }
        });

        for(Sequence s : sequences){
            System.out.print(s.secondIndex + " ");
        }


    }
}

class Sequence{
    int number, firstIndex, secondIndex;

    public Sequence(int number,int firstIndex){
        this.number = number;
        this.firstIndex = firstIndex;
    }

    public Sequence(int secondIndex){
        this.secondIndex = secondIndex;
    }

    public int getNumber(){
        return this.number;
    }

}