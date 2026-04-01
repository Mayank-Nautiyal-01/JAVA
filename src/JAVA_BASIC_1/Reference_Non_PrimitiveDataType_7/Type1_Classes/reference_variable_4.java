package JAVA_BASIC_1.Reference_Non_PrimitiveDataType_7.Type1_Classes;

public class reference_variable_4 {
  int num=50;

    public static void main(String[] args) {
        reference_variable_4 r1= new reference_variable_4();
        reference_variable_4 r2=r1;

        System.out.println(r1.num);//50
        System.out.println(r2.num);//50

    }
}

// what is happening in the code lets see:=

//step1= reference_variable_4 r1 = new reference_variable_4();
// - obj is created in heap
//-r1 stores its reference

//  stack                     heap
//    r1 ----------------->   obj
//                             num=50

//step 2 = reference_variable_4 r2 = r1;
//- now new obj is created
//-r2 just copies the reference of r1
//
//Stack                Heap
//-----                ----------------
//r1  -----------\
//                 --->   object
//r2  -----------/        num = 50


//Important Concept:
//r1 and r2 are pointing to SAME object


//note========>

//r2.num = 100;
//
//        System.out.println(r1.num);//100
//System.out.println(r2.num); //100

//Why both changed?
//
//Because:
//
//There is ONLY ONE object in heap
//
//Both r1 and r2 are pointing to that same object.


//Memory Diagram After Change
//Stack                      Heap
//------                    ----------------
//r1  -----------\
//                   --->       object
//r2  -----------/            num = 100


//Most Important Line (Remember Forever)
//
//===> In Java, variables store reference, not objects
//// then why does java do this ? // maybe asked in interview?
//==>Because:
//
//Objects can be large
//
//Copying full object every time =  slow
//
//So Java uses reference (address) =  efficient
//------------------------------------------

//Common Mistake (in Interview)
//
//Many beginners think:
//
//r2 = r1 → new object created -wrong
//
//Correct:
//
//r2 = r1 → same reference copied --correct