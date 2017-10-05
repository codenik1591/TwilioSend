
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TwilioSend() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String accountSid = "AC0b0ea7eb42a948256da95fcef1571ca1";
		String authToken = "bddb0ad5fe6f8bd65a8146346b0effbf";

		Twilio.init(accountSid, authToken);
		Message message = Message.creator(
				new PhoneNumber("+17866810244"), // to
				new PhoneNumber("+15512295964"), // from
				"Nikhil ke dimaag ka shot ho gaya hai" // body
		).create();

		System.out.println(message.getSid());
	}

	

}
