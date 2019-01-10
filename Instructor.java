class Instructor extends Employee implements Lecturer {
  private int appointmentLength;

  public Instructor(String name, int id, double salary, int appointmentLength) {
    super(name, id, salary);
    this.appointmentLength = appointmentLength;
  }

  public void instructorSpecificMethod() {
    System.out.println("Only for instructors");
  }

  @Override
  public double getMonthlyPay(double hoursWorked) {
    return this.getPayRate() / this.appointmentLength;
  }

  public String deliverLecture() {
    return "blah blah blah...";
  }
}
