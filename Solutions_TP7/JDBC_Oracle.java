
import java.io.*  ;
import java.sql.* ;

public class JDBC_Oracle  {
	//Cr�ation de la connexion � la base
    private Connection con ;
    public void init_oracle()
    {
       try {
    	 //Chargement du pilote JDBC pour ORACLE puis creation de la connection
    	   //Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    	   DriverManager.registerDriver( new oracle.jdbc.driver.OracleDriver());
    	// ou bien Class.forName("com.mysql.jdbc.Driver").newInstance();
           con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:lfig2","root","lfig2");
						if (con!=null)
							System.out.println("Connexion � la base de donn�es a �t� �tablie avec succ�s");
						   else 
							System.out.println("Probl�me de connexion � la base");
						
       }
       catch(SQLException e1) {
           System.out.println("--> SQLException : " + e1) ;
       }
       catch(Exception e2) {
           System.out.println("--> Exception : " + e2) ;
       }
    }


    //----------------------------------------------------------------------
    public void SelectFunction(String query) {

         try {
      	 //Cr�er un �tat permettant de r�aliser une instruction simple  
           Statement st = con.createStatement() ;
           //Ex�cuter la requete
           ResultSet rs = st.executeQuery(query) ;
         //Lire et afficher les r�sultats de la r�quete
           while (rs.next()) {
                 System.out.println("--> " + rs.getInt(1)) ;
                 System.out.println("--> " + rs.getString(2)) ;
           
           }
           st.close();
           //con.close();
         }
         catch(SQLException e1) {
             System.out.println("--> SQLException : " + e1) ;
         }
         
    }
    //----------------------------------------------------------------------
    public void SelectParametreFunction(String query) {

         try {
      	 //Cr�er un �tat permettant de r�aliser une instruction parametree avec le caractere ?  
      	  PreparedStatement st = con.prepareStatement(query) ;
      	  st.setString(1, "11111111");
           //Ex�cuter la requete
           ResultSet rs = st.executeQuery() ;
         //Lire et afficher les r�sultats de la r�quete
           while (rs.next()) {
                 System.out.println("--> " + rs.getInt(1)) ;
                 System.out.println("--> " + rs.getString(2)) ;
           
           }
           st.close();
           //con.close();
         }
         catch(SQLException e1) {
             System.out.println("--> SQLException : " + e1) ;
         }
         
    }
  //----------------------------------------------------------------------
    public void UpdateFunction(String query) {

         try {
      	 //Cr�er un �tat permettant de r�aliser une instruction simple  
           Statement st = con.createStatement() ;
           //Ex�cuter la requete
           int rs = st.executeUpdate(query) ;
           System.out.println("--> " + rs+" lignes sont modifiees") ;
           st.close();
           //con.close();
         }
         catch(SQLException e1) {
             System.out.println("--> SQLException : " + e1) ;
         }
         
    }
  //----------------------------------------------------------------------
    public void InsertFunction(String query) {

         try {
      	 //Cr�er un �tat permettant de r�aliser une instruction simple  
           Statement st = con.createStatement() ;
           //Ex�cuter la requete
           int rs = st.executeUpdate(query) ;
           System.out.println("--> " + rs+" lignes sont inserees") ;
           st.close();
           //con.close();
         }
         catch(SQLException e1) {
             System.out.println("--> SQLException : " + e1) ;
         }
         
    }
  //----------------------------------------------------------------------
    public void DeleteFunction(String query) {

         try {
      	 //Cr�er un �tat permettant de r�aliser une instruction simple  
           Statement st = con.createStatement() ;
           //Ex�cuter la requete
           int rs = st.executeUpdate(query) ;
           System.out.println("--> " + rs+" lignes sont supprimees") ;
           st.close();
           con.close();
         }
         catch(SQLException e1) {
             System.out.println("--> SQLException : " + e1) ;
         }
         
    }
    //----------------------------------------------------------------------
     public static void main(String args[])
       {
    	 JDBC_Oracle test = new JDBC_Oracle();
            test.init_mysql();
            //Ex�cuter une instruction simple de type SELECT
            test.SelectFunction("select * from etudiant");
            //Ex�cuter une instruction simple de type UPDATE
            test.UpdateFunction("update etudiant set nom='saad' where cin=11111111");
            //Ex�cuter une instruction simple de type INSERT
            test.InsertFunction("insert into etudiant values (145,'aa','bb','aa@gmail.com')");
            //Ex�cuter une instruction simple de type DELETE
            test.DeleteFunction("delete from etudiant where cin=145");
            //Ex�cuter une instruction parametree de type SELECT
            test.SelectParametreFunction("select * from etudiant where cin=?");
            

    }

  }
  //----------------------------------------------------------------------
