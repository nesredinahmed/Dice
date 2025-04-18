
class Die {
    public static int roll() {
        int minValue = 1;
        int maxValue = 6;
        return (int) (Math.random() * maxValue) + minValue;
    }
}


public class Main {
    public static String bar(int qty){
        //"###" would be 3
        String output = "";
        for(int b = 0; b < qty; b++){
            output += "#";
        }
        return output;
    }
    public static void main(String[] args) {

        // 3 - 18 are the possible results
        int[] counters = new int[16]; //16 slots 18 - 3

        //roll roll roll x 500
        for(int i = 0; i < 500; i++) {
            int value = Die.roll() + Die.roll() + Die.roll();
//            counters[value - 3] = counters[value - 3] + 1;
            counters[value - 3]++;
        }

        //print qty for each slot
        for(int s = 3; s <= 18; s++){
            int qty = counters[s - 3];
            System.out.printf("|%s (%d:%d)\n", bar(qty), s, qty);
        }

//        int twos = 0;
//        int threes = 0;
//        int fours = 0;
//        int fives = 0;
//        int sixes = 0;
//        int sevens = 0;
//        int eight = 0;
//        int nines = 0;
//        int tens = 0;
//        int eleven = 0;
//        int twelve = 0;
//
//        for(int i = 0; i < 100; i++){
//            int value = Die.roll() + Die.roll();
//
//            if(value == 2){
//                twos++;
//            }else if(value == 3){
//                threes++;
//            }else if(value == 4){
//                fours++;
//            }else if(value == 5){
//                fives++;
//            }else if(value == 6){
//                sixes++;
//            }else if(value == 7){
//                sevens++;
//            }else if(value == 8){
//                eight++;
//            }else if(value == 9){
//                nines++;
//            }else if(value == 10){
//                tens++;
//            }else if(value == 11){
//                eleven++;
//            }else if(value == 12){
//                twelve++;
//            }
//
//        }//end loop
//        System.out.println(twos);
//        System.out.println(threes);
//        System.out.println(fours);
//        System.out.println(fives);
//        System.out.println(sixes);
//        System.out.println(sevens);
//        System.out.println(eight);
//        System.out.println(nines);
//        System.out.println(tens);
//        System.out.println(eleven);
//        System.out.println(twelve);
    }
}