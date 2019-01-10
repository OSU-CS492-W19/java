class EmployeeStuff {
  public static void main(String[] args) {
    Employee e = new Employee("Luke Skywalker", 933111111, 40.00);
    Instructor i = new Instructor("Leia Organa", 933222222, 1000000.00, 9);

    System.out.println(e.getName() + " makes " + e.getMonthlyPay(160));
    System.out.println(i.getName() + " makes " + i.getMonthlyPay(160));

    Employee i_as_e = i;
    System.out.println(i_as_e.getName() + " makes " + i_as_e.getMonthlyPay(160));
    ((Instructor)i_as_e).instructorSpecificMethod();

    doLecture(i);
  }

  static void doLecture(Lecturer l) {
    System.out.println(l.deliverLecture());
  }
}
