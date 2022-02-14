public class Subject {
  private String nameCourse;
  private int points;
  private int grade;
  private int numberOfWorks;

  public Subject(String nameCourse, int points, int grade, int numberOfWorks){
    this.nameCourse = nameCourse;
    this.grade = grade;
    this.points = points;
    this.numberOfWorks = numberOfWorks;
  }
  public int getPoints(int numberOfWorks, int grade){
    int points = 0;
    if(numberOfWorks > this.numberOfWorks/2 && (grade > this.grade)){
      points = this.points;
    }
    return points;
  }

  public String getNameCourse() {
    return nameCourse;
  }

  public void setNameCourse(String nameCourse) {
    this.nameCourse = nameCourse;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public int getNumberOfWorks() {
    return numberOfWorks;
  }

  public void setNumberOfWorks(int numberOfWorks) {
    this.numberOfWorks = numberOfWorks;
  }
}
