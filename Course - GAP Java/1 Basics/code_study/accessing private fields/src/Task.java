import java.lang.reflect.Field;

class Task {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    Student student = new Student("John", 21);

    readPrivateField(student);

  }

  private static void readPrivateField(Student student) throws NoSuchFieldException, IllegalAccessException {
    Field field = student.getClass().getDeclaredField("name");
    field.setAccessible(true);
    System.out.println(field.get(student));
  }
}