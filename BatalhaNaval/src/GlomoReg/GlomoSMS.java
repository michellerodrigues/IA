package GlomoReg;

import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public class GlomoSMS
{
  private static MessageConnection jdField_a_of_type_JavaxWirelessMessagingMessageConnection = null;
  private static boolean jdField_a_of_type_Boolean = false;

  public static boolean send(String paramString1, String paramString2)
  {
    jdField_a_of_type_Boolean = false;
    if (paramString1.length() > 0)
      try
      {
        if (jdField_a_of_type_JavaxWirelessMessagingMessageConnection != null)
        {
          jdField_a_of_type_JavaxWirelessMessagingMessageConnection.close();
          jdField_a_of_type_JavaxWirelessMessagingMessageConnection = null;
        }
        (paramString1 = (TextMessage)(GlomoSMS.jdField_a_of_type_JavaxWirelessMessagingMessageConnection = (MessageConnection)Connector.open("sms://" + paramString1)).newMessage("text")).setPayloadText(paramString2);
        jdField_a_of_type_JavaxWirelessMessagingMessageConnection.send(paramString1);
        jdField_a_of_type_JavaxWirelessMessagingMessageConnection.close();
        jdField_a_of_type_JavaxWirelessMessagingMessageConnection = null;
        jdField_a_of_type_Boolean = true;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw (paramString1 = localIllegalArgumentException);
      }
      catch (Exception localException)
      {
        throw (paramString1 = localException);
      }
    return jdField_a_of_type_Boolean;
  }

  public static boolean isSent()
  {
    return jdField_a_of_type_Boolean;
  }
}