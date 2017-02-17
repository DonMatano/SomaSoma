package com.matano.somasoma.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matano on 17/2/17.
 */

public class FirebaseConnector
{
    private DatabaseReference databaseReference;


    public FirebaseConnector()
    {
        databaseReference = FirebaseDatabase.getInstance().getReference();
        writeNewUrl();
    }

    private void writeNewUniversity()
    {
        DatabaseReference universityRefernence = databaseReference.child("university");
        universityRefernence.push().setValue(new University("DR Ambedkar University"));
    }

    private void writeNewCourse()
    {
        DatabaseReference courseReference = databaseReference.child("course");
        courseReference.push().setValue(new Course("BCA"));
    }

    private void writeNewSemester()
    {

        DatabaseReference semesterReference = databaseReference.child("course")
                .child(databaseReference.child("course").getKey());
        semesterReference.push().setValue(new Semester("Semester 1"));
    }

    private void writeNewSubject()
    {
        DatabaseReference subjectReference = databaseReference.child("subject");
        subjectReference.push().setValue(new Subject("Database Management"));
    }

    private void writeNewUnit()
    {
        DatabaseReference unitReference = databaseReference.child("unit");
        unitReference.push().setValue(new Unit("Unit 1"));
    }

    private void writeNewTopic()
    {
        DatabaseReference topicReference = databaseReference.child("topic");
        String[] topicNamesArray = {
                "Definition of DBMS", "Components of DBMS",
                "Advantages and Disadvantages of DBMS",
                "Characteristics of database approach", "Data models",
                "DBMS architecture", "Data independence"
        };

        for (String topicName: topicNamesArray)
        {
            topicReference.push().setValue(new Topic(topicName));
        }

    }

    private void writeNewUrl()
    {
        DatabaseReference urlReference = databaseReference.child("url");
        String[] urlAddressesArray =
                {
                        "http://www.studytonight.com/dbms/overview-of-dbms",
                        "http://www.dbmsbasics.blogspot.in/2008/02/" +
                                "database-system-and-its-components.html",
                        "http://www.tutorialcup.com/dbms/database-management" +
                                "-system.htm",
                        "http://www.whatisdbms.com/characteristics-of-database" +
                                "-management-system",
                        "http://www.studytonight.com/dbms/database-model",
                        "http://www.studytonight.com/dbms/architecture-of-database",
                        "http://www.ecomputernotes.com/fundamental/what" +
                                "-is-a-database/data-independence"
                };

        for (String urlAddress : urlAddressesArray)
        {
            urlReference.push().setValue(new Url(urlAddress));
        }
    }

    private void createDatabaseStructure()
    {
        ArrayList<Topic> topicArray = new ArrayList<>();
        ArrayList<Url> urlArray = new ArrayList<>();
        Unit unit = new Unit("Unit 1");
        ArrayList<Unit> unitList = new ArrayList<>();
        unitList.add(unit);

        Subject subject = new Subject("Database Management");
        ArrayList<Subject> subjectList = new ArrayList<>();
        subjectList.add(subject);

        Semester semester = new Semester("Semester");
        ArrayList<Semester> semesterList = new ArrayList<>();
        semesterList.add(semester);

        Course course = new Course("BCA");
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(course);

        University university = new University("DR Bhim Rao Ambedkar");

        String[] urlAddressList = {
                "http://www.studytonight.com/dbms/overview-of-dbms",
                "http://www.dbmsbasics.blogspot.in/2008/02/" +
                        "database-system-and-its-components.html",
                "http://www.tutorialcup.com/dbms/database-management" +
                        "-system.htm",
                "http://www.whatisdbms.com/characteristics-of-database" +
                        "-management-system",
                "http://www.studytonight.com/dbms/database-model",
                "http://www.studytonight.com/dbms/architecture-of-database",
                "http://www.ecomputernotes.com/fundamental/what" +
                        "-is-a-database/data-independence"
        };

        String[] topicNamesList = {
                "Definition of DBMS", "Components of DBMS",
                "Advantages and Disadvantages of DBMS",
                "Characteristics of database approach", "Data models",
                "DBMS architecture", "Data independence"
        };

        for (String topicName: topicNamesList)
        {
            topicArray.add(new Topic(topicName));
        }

        int count = 0;
        for (String urlAddress: urlAddressList)
        {
                Topic topic = topicArray.get(count);
                urlArray.add(new Url(urlAddress, topic));
                count ++;
        }

        count = 0;
        for (Topic topic: topicArray)
        {
            ArrayList<Url> urlList = new ArrayList<>();
            urlList.add(urlArray.get(count));
            topic.setUrlList(urlList);
            topic.setUnitList(unitList);
            count++;
        }

        unit.setTopicList(topicArray);
        subject.setUnitList(unitList);
        semester.setSubjectList(subjectList);
        course.setSemesterList(semesterList);
        university.setCourseList(courseList);

        DatabaseReference universityReference = databaseReference.child("university");
        universityReference.push().setValue(university);

    }

}

