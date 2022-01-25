package OOP.Encapsulation;

public class person {
        private String nama;
    
        public String getName(){
            //Just read
            //dimana this.name tadi meng rubah nilai dari nama sekarang tinggal mengreadnya ke user
            return nama;
        }
        public void setName(String newname){
            //just Write
            this.nama=newname;
            //diam diam atribut nama berganti dari null ke newname
        }
    }