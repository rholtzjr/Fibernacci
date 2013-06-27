Fibernacci Service
==========
<pre>
This project is a service based implementation of the Fibonacci suquence generator.  This application will accept a SOAP-based reuqest and provide a SOAP-based response.

The application provides a int primitive method that illistrates the limitation of 2**31 - 1 datatype.   The second method is a BigInteger implementation that provides a means to workaround the limitation.  The only limitation is the input parameter.  

i.e. 

getSequence(int sequence_num) - int based
getBigSequence(long sequence_num) BigInteger based
</pre>
