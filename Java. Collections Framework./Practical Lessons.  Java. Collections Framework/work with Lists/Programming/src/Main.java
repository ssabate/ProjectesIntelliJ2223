public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String allElements = reader.readLine();
    List<Integer> bigList = createBigList(allElements);

    ArrayList<Integer> div2list ;
    ArrayList<Integer> div3list ;
    ArrayList<Integer> otherlist ;

    //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists 

    //get result list from createListOfLists
    List<List<Integer>> resultList;

    //call printInLine() for resultList
    printInLine(resultList);
}
public static List<Integer> createBigList(String str){
    List<Integer> bigList = new ArrayList<Integer>();
    String[] strarr = str.split(" ");

   for(String s : strarr){
   //convert(using Integer.parseInt(s) or Integer.valueOf(s)) and add all elements from srtarr to bigList
   }
    return bigList;
}

public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list ,List<Integer> otherList){
    //add all lists like items in resultList(list of lists) and return it, first-div2list, second-div3list, third-otherList
    return resultList;
}