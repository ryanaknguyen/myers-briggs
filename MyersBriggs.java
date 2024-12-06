import java.util.Scanner;
import java.util.*;

public class MyersBriggs {
  public static String[] answers = new String[4];
  public static HashMap<String, Integer> letters = new HashMap<>();

  public static void main(String[] args) {
    test();
  }

  private static void test() {
    Scanner s = new Scanner(System.in);
    System.out.println("\nWelcome to the Myers-Briggs Type Indicator (MBTI) test!");
    System.out.println("For each pair of statements, type \"A\" or \"B\" to indicate the statement that resonates with you most.\n");

    // Question 1
    System.out.println("-- Question 1 --");
    System.out.println("A: Could be described as talkative, outgoing");
    System.out.println("B: Could be described as reserved, private");
    System.out.print("Type A or B: ");
    answers[0] = s.next();
    System.out.println();

    // Question 2
    System.out.println("-- Question 2 --");
    System.out.println("A: Make decisions in an impersonal way, using logical reasoning");
    System.out.println("B: Base your decisions on personal values and how your actions affect others");
    System.out.print("Type A or B: ");
    answers[1] = s.next();
    System.out.println();

    // Question 3
    System.out.println("-- Question 3 --");
    System.out.println("A: Focus on the reality of how things are");
    System.out.println("B: Imagine the possibilities of how things could be");
    System.out.print("Type A or B: ");
    answers[2] = s.next();
    System.out.println();

    // Question 4
    System.out.println("-- Question 4 --");
    System.out.println("A: Prefer to have matters settled");
    System.out.println("B: Prefer to leave your options open");
    System.out.print("Type A or B: ");
    answers[3] = s.next();
    System.out.println();

    for (int i = 0; i < 4; i++) {
      System.out.println(answers[i]);
    }
  }
}
