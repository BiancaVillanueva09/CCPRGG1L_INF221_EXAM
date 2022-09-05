public class App {
    public static void main(String[] args) {
    
    //Student class
    Student Me = new Student();

    Me.Surname = "Villanueva";
    Me.Firstname = "Bianca";
    Me.MiddleInitial = "F.";
    Me.DateofBirth = "10/9/2004";
    Me.StudentNumber = 2022102796;
    Me.StudentEmailAddress = "villanuevabf@students.national-u.edu.ph";
    Me.AmIAwesome = "Of course!";
   
    Me.showStudentNumber();
    Me.showStudentEmailAddress();
    Me.showAmIAwesome();
    }
}
