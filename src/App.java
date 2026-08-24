// // void main()
// // {

// //     int heltal= 10;
// //     double decimal = 0.8;
// //     int[] arr_tal = new int[10];
// //     if(heltal == 10){
// //         IO.println(arr_tal);
// //     }

// //     boolean sant= true;
// //   String namn = IO.readln("ange namn: ");
// //   IO.println("hello " +namn);
// // }

// void main() {
//   String s_ålder = IO.readln("ange din ålder");

//   // typ convt
//   int ålder = Integer.parseInt(s_ålder);

//   if (ålder < 18) {
//     IO.println("du är barn ");

//   } else if (ålder == 18) {
//     IO.println("yey");
//   } else {
//     IO.println("go ");
//   }

//   // switch (ålder) {
//   // case 18 -> IO.println("hi");

//   // default -> IO.println("elder");

//   // }
//   int varv = 0;
//   while (varv < 10) {
//     IO.println("varv nr" + varv);
//     varv = varv + 1;

//   }

// }
// void main() {
//   Random slump_generator = new Random();
//   int hemligt_tal = slump_generator.nextInt(9) + 1; // Random.Shared.next(1,11)

//   IO.println("10-1 guess");
//   String answer = IO.readln();
//   int guess = Integer.parseInt(answer);
//   if (guess < hemligt_tal) {
//     IO.println("too low");
//   } else if (guess > hemligt_tal) {
//     IO.println("too high");
//   } else {
//     IO.println("right");
//   }

// }
//number guesser

import java.util.Random;

void main() {
    
    String[] food = { "pizza", "burger", "cheese cake", "pot rost" };
    Random foodnum = new Random();
    int points = 0;
    int points_tried = 0;
    while (points_tried < 3) {
        int random_food = foodnum.nextInt(food.length) ;
        String answer = IO.readln();
        if (food[random_food].equals(answer)) {
            IO.println("correect");
            points = points + 1;
            points_tried = points_tried + 1;

        } else {
            IO.println("false");
            points_tried = points_tried + 1;

        }
    }
    IO.println("you got " + points + " out of 3");

}