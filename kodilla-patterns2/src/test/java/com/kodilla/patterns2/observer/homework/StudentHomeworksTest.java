package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentHomeworksTest {

    @Test
    public void testUpdate() {
        // Given
        StudentHomeworks artur = new StudentHomeworks();
        StudentHomeworks bartek = new StudentHomeworks();
        Mentor mentorMateusz = new Mentor("Mateusz");
        Mentor mentorJacek = new Mentor("Jacek");
        artur.registerObserver(mentorMateusz);
        bartek.registerObserver(mentorJacek);
        artur.registerObserver(mentorJacek);
        // When
        artur.addHomework("aaa");
        bartek.addHomework("bbb");
        artur.addHomework("ccc");
        artur.addHomework("ddd");
        bartek.addHomework("eee");
        // Then
        assertEquals(5,mentorJacek.getUpdateCount());
        assertEquals(3,mentorMateusz.getUpdateCount());
    }
}