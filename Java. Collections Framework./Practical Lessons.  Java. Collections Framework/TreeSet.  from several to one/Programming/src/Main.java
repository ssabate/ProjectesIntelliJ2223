public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] sets = reader.readLine().split(";"); 

    Set<Integer> set1;
    //your code(add elements to set1 from sets[0])

    Set<Integer> set2;
    //your code(add elements to set2 from sets[1])

    Set<Integer> set3;
    //your code(add elements to set3 from sets[2])


    Set<Integer> resultTreeSet = unionTreeLargeNumber(set1,set2,set3);

    //print elements of resultTreeSet(using System.out.printLn()) below

}

public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3){
    TreeSet<Integer> resultSet = new TreeSet<>();

    return resultSet;
}