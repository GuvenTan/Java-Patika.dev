package Classes.ÖgrenciBilgiSistemi;

public class Student {
	String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avaragemat;
    double avaragekim;
    double avaragefiz;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarageMat();
        calcAvarageFiz();
        calcAvarageKim();
        this.isPass = false;
    }
    
    public void addSozluExam(int mat, int fizik, int kimya) {
    	if (mat >= 0 && mat <= 100) {
            this.mat.sozlu = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozlu = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozlu = kimya;
        }
    	
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.sozlu == 0 || this.fizik.sozlu == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public double calcAvarageMat() {
        this.avaragemat = this.mat.sozlu*0.2 + this.mat.note*0.8;
        return this.avaragemat;
    }
    
    public double calcAvarageKim() {
        this.avaragekim = this.kimya.note*0.8 + this.kimya.sozlu*0.2;
        return this.avaragekim;
    }
    
    
    public double calcAvarageFiz() {
        this.avaragefiz = this.fizik.note*0.8 + this.fizik.sozlu*0.2 ;
        return this.avaragefiz;
    }
    
    
    public double CalculateGeneralAvg() {
    	this.avarage = (calcAvarageFiz() + calcAvarageKim() + calcAvarageMat()) / 3;
    	return this.avarage;
    }
    
    
    public boolean isCheckPass() {
        CalculateGeneralAvg();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note);
        System.out.println("Matematik Sozlu Notu : " + this.mat.sozlu);
        System.out.println("Matematik Notu : " + calcAvarageMat());
        System.out.println("Fizik Sınav Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu Notu : " + this.fizik.sozlu);
        System.out.println("Fizik Notu : " + calcAvarageFiz());
        System.out.println("Kimya Sınav Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu Notu : " + this.kimya.sozlu);
        System.out.println("Kimya Notu : " + calcAvarageKim());
    }
}
