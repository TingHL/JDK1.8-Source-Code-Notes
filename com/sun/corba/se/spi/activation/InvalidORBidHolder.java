package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/InvalidORBidHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-i586-cygwin/jdk8u271/605/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, September 17, 2020 1:52:42 AM UTC
*/

public final class InvalidORBidHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.InvalidORBid value = null;

  public InvalidORBidHolder ()
  {
  }

  public InvalidORBidHolder (com.sun.corba.se.spi.activation.InvalidORBid initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.InvalidORBidHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.InvalidORBidHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.InvalidORBidHelper.type ();
  }

}
