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

// import java.util.Random;

// void main() {

//     String[] food = { "pizza", "burger", "cheese cake", "pot rost" };
//     Random foodnum = new Random();
//     int points = 0;
//     int points_tried = 0;
//     while (points_tried < 3) {
//         int random_food = foodnum.nextInt(food.length) ;
//         String answer = IO.readln();
//         if (food[random_food].equals(answer)) {
//             IO.println("correect");
//             points = points + 1;
//             points_tried = points_tried + 1;

//         } else {
//             IO.println("false");
//             points_tried = points_tried + 1;

//         }
//     }
//     IO.println("you got " + points + " out of 3");

// }

void main() {
    
    while (true) {
        IO.println("Meny");
        IO.println("1. ADD");
        IO.println("2. SUBTRACT");
        IO.println("3. DIVIDE");
        IO.println("4. MULTIPLY");
        IO.println("5. STOP");
        IO.println("pick from 1 to 5");

        String answer = IO.readln("");
        int the_answer = Integer.parseInt(answer);
        if (the_answer == 1) {
            IO.println("add");
            String answer_add = IO.readln("");
            String answer_add2 = IO.readln("");
            int the_answer_add = Integer.parseInt(answer_add);
            int the_answer_add2 = Integer.parseInt(answer_add2);
            IO.println(the_answer_add + the_answer_add2);
        } else if (the_answer == 2) {
            IO.println("2. SUBTRACT");
            String answer_sub = IO.readln("");
            String answer_sub2 = IO.readln("");
            int the_answer_sub = Integer.parseInt(answer_sub);
            int the_answer_sub2 = Integer.parseInt(answer_sub2);
            IO.println(the_answer_sub - the_answer_sub2);

        } else if (the_answer == 3) {
            IO.println("2. mult");
            String answer_mult = IO.readln("");
            String answer_mult2 = IO.readln("");
            int the_answer_mult = Integer.parseInt(answer_mult);
            int the_answer_mult2 = Integer.parseInt(answer_mult2);
            IO.println(the_answer_mult * the_answer_mult2);

        } else if (the_answer == 4) {
            IO.println("2. div");
            String answer_div = IO.readln("");
            String answer_div2 = IO.readln("");
            int the_answer_div = Integer.parseInt(answer_div);
            int the_answer_div2 = Integer.parseInt(answer_div2);
            IO.println(the_answer_div / the_answer_div2);

        } else if (the_answer == 5) {
            IO.println("2. SUBTRACT");
            IO.println("k?");
            break;

        }

    }
}
