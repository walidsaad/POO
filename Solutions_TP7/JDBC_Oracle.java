
import java.io.*  ;
import java.sql.* ;

public class JDBC_Oracle  {
	//Création de la connexion à la base
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
							System.out.println("Connexion à la base de données a été établie avec succès");
						   else 
							System.out.println("Problème de connexion à la base");
						
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
      	 //Créer un état permettant de réaliser une instruction simple  
           Statement st = con.createStatement() ;
           //Exécuter la requete
           ResultSet rs = st.executeQuery(query) ;
         //Lire et afficher les résultats de la réquete
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
      	 //Créer un état permettant de réaliser une instruction parametree avec le caractere ?  
      	  PreparedStatement st = con.prepareStatement(query) ;
      	  st.setString(1, "11111111");
           //Exécuter la requete
           ResultSet rs = st.executeQuery() ;
         //Lire et afficher les résultats de la réquete
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
      	 //Créer un état permettant de réaliser une instruction simple  
           Statement st = con.createStatement() ;
           //Exécuter la requete
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
      	 //Créer un état permettant de réaliser une instruction simple  
           Statement st = con.createStatement() ;
           //Exécuter la requete
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
      	 //Créer un état permettant de réaliser une instruction simple  
           Statement st = con.createStatement() ;
           //Exécuter la requete
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
            //Exécuter une instruction simple de type SELECT
            test.SelectFunction("select * from etudiant");
            //Exécuter une instruction simple de type UPDATE
            test.UpdateFunction("update etudiant set nom='saad' where cin=11111111");
            //Exécuter une instruction simple de type INSERT
            test.InsertFunction("insert into etudiant values (145,'aa','bb','aa@gmail.com')");
            //Exécuter une instruction simple de type DELETE
            test.DeleteFunction("delete from etudiant where cin=145");
            //Exécuter une instruction parametree de type SELECT
            test.SelectParametreFunction("select * from etudiant where cin=?");
            

    }

  }
  //----------------------------------------------------------------------
