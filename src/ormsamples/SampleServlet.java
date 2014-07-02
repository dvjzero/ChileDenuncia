/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SampleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			if (action.equals("create")) {
				ORMDatabaseInitiator.createSchema(orm.ChileDenunciaPersistentManager.instance());
			}
			else if (action.equals("drop")) {
				ORMDatabaseInitiator.dropSchema(orm.ChileDenunciaPersistentManager.instance());
			}
			else {
				if (action.equals("insert")) {
					CreateChileDenunciaData createChileDenunciaData = new CreateChileDenunciaData();
					createChileDenunciaData.createTestData();
				}
				else if (action.equals("update")) {
					RetrieveAndUpdateChileDenunciaData retrieveAndUpdateChileDenunciaData = new RetrieveAndUpdateChileDenunciaData();
					retrieveAndUpdateChileDenunciaData.retrieveAndUpdateTestData();
				}
				else if (action.equals("delete")) {
					DeleteChileDenunciaData deleteChileDenunciaData = new DeleteChileDenunciaData();
					deleteChileDenunciaData.deleteTestData();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//***** To ensure persistent session is closed after every request, either add the following lines to "Web.xml" (recommended):
		//
		//<filter>
		//  <filter-name>ORMFilter</filter-name>
		//	<filter-class>ormsamples.ChileDenunciaFilter</filter-class>
		//</filter>
		//
		//<filter-mapping>
		//	<filter-name>ORMFilter</filter-name>
		//	<url-pattern>/*</url-pattern>
		//</filter-mapping>
		//
		//***** or add the following statement at the end of each servlet that used ORM:
		//
		//orm.ChileDenunciaPersistentManager.instance().getSession().close();", true);
		
		PrintWriter lWriter = response.getWriter();
		lWriter.println("Sample Servlet. Action = " + action);
		lWriter.close();
	}
}
