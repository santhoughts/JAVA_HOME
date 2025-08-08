package InterviewQuestion;

public class StringConcepts {

    public static void main(String[] args) {

        String a = "Hello"; // String Literal, Immutable(Can't modify the string)
        String b = "Hello"; // This variable not store as hello because hello is already present in memory

        String s = new String("Hello");
        String s1 = new String("Hello"); //This Hello is also store in memory with new variable s1

        // We try to modify the string literal variable by concatenating with other string
        a.concat("World");
        System.out.println(a); // Hello(We got the result hello because it is immutable)

        // For making the string mutable we used StingBuffer and StringBuilder class
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World"); // HelloWorld
        System.out.println(sb);
        sb.insert(2, "Is"); // HeIslloWorld
        System.out.println(sb);
        sb.replace(5, 7, "LL"); //HeIslLLWorld
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        // StringBuffer- It is thread safe & Synchronized, It is slower(Help for parallel running)
        // StringBuilder- It is not thread safe & non-synchronized, It is faster

        // Compare equals & == operator

        System.out.println(a.equals(b)); // true
        System.out.println(a==b); // true (Refer true because refer same object)
        System.out.println(a.equals(s)); // true
        System.out.println(a==s); // fail to matching reference
        System.out.println(s==s1); //fail references are different as they defined with String class



    }
}
