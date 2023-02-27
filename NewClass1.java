
import java.util.*;
import java.util.Random;
import java.util.ArrayList;

public class NewClass1 {

    static String house1 = "Gryffindor";
    static String house2 = "Hufflepuff";
    static String house3 = "Ravenclaw";
    static String house4 = "Slytherin";

    static void lessthan4(String name, int i) {
        if (i == 1) {
            System.out.println(name + " " + house1);
        }
        if (i == 2) {
            System.out.println(name + " " + house2);
        }
        if (i == 3) {
            System.out.println(name + " " + house3);
        }
        if (i == 4) {
            System.out.println(name + " " + house4);
        }
    }

    static void morethan4(String name, int i) {
        if (i == 1) {
            System.out.println(name + " " + house1);
        }
        if (i == 2) {
            System.out.println(name + " " + house2);
        }
        if (i == 3) {
            System.out.println(name + " " + house3);
        }
        if (i == 4) {
            System.out.println(name + " " + house4);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean reset = false;
        try {
            while (reset == false) {
                int N = sc.nextInt();
                ArrayList<String> Gryffindor = new ArrayList<String>();
                ArrayList<String> Hufflepuff = new ArrayList<String>();
                ArrayList<String> Ravenclaw = new ArrayList<String>();
                ArrayList<String> Slytherin = new ArrayList<String>();
                sc.nextLine();
                for (int i = 1; i < N + 1; i++) {
                    String name = sc.nextLine();
                    if (i > 4) {
                        int random = rand.nextInt(4) + 1;
                        if (random > 0) {
                            if (random == 1) {
                                Gryffindor.add(name);
                            }
                            if (random == 2) {
                                Hufflepuff.add(name);
                            }
                            if (random == 3) {
                                Ravenclaw.add(name);
                            }
                            if (random == 4) {
                                Slytherin.add(name);
                            }
                            morethan4(name, random);
                        }else{
                            Gryffindor.add(name);
                        }
                    } else if (i <= 4) {
                        if (i == 1) {
                            Gryffindor.add(name);
                        }
                        if (i == 2) {
                            Hufflepuff.add(name);
                        }
                        if (i == 3) {
                            Ravenclaw.add(name);
                        }
                        if (i == 4) {
                            Slytherin.add(name);
                        }

                        lessthan4(name, i);
                    }
                }
                System.out.println("this is the end : Want to reset ? ");
                System.out.println("0 > dont reset");
                System.out.println("1 >  reset");
                System.out.println("2 >  show house");
                int state = sc.nextInt();
                if (state == 0) {
                    reset = true;
                }
                if (state == 2) {
                    System.out.print("Gryffindor>>>>>>>>>>");
                    for (int i = 0; i < Gryffindor.size(); i++) {
                        System.out.print(" " + Gryffindor.get(i) + " ");
                    }
                    System.out.println();
                    System.out.print("Hufflepuff>>>>>>>>>>>>>");
                    for (int i = 0; i < Hufflepuff.size(); i++) {
                        System.out.print(" " + Hufflepuff.get(i) + " ");

                    }
                    System.out.println();
                    System.out.print("Ravenclaw >>>>>>>>");
                    for (int i = 0; i < Ravenclaw.size(); i++) {
                        System.out.print(" " + Ravenclaw.get(i) + " ");

                    }
                    System.out.println();
                    System.out.print("Slytherin>>>>>>>>>");
                    for (int i = 0; i < Slytherin.size(); i++) {
                        System.out.print(" " + Slytherin.get(i) + " ");

                    }
                    System.out.println();

                    System.out.println("this is the end : Want to reset ? ");
                    System.out.println("0 > dont reset");
                    System.out.println("1 >  reset");
                    int state2 = sc.nextInt();
                    if (state2 == 0) {
                        reset = true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong.");
            System.out.println("please close porgram to restart.");
        }
    }
}
