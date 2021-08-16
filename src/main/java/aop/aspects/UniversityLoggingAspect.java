package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudetsLoggingAdvice() {
        System.out.println("beforeGetStudetsLoggingAdvice: logging reciving " + "sutdent list before method getStudents");
    }

//    @AfterReturning (
//            pointcut = "execution(* getStudents())",
//            returning = "students")
//    public void afterReturningGetStudetsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 15;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudetsLoggingAdvice: logging reciving " + "sutdent list after ending method getStudents");
//    }

    @AfterThrowing("execution(* getStudents())")
    public void afterThrowingGetStudetsLoggingAdvice() {
        System.out.println("afterThrowingGetStudetsLoggingAdvice: log the exception throw ");
    }
}
