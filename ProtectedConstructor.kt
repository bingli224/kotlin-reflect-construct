
/**
 * @author	BingLi224
 * @version	2019.01.20
 *
 * Create object with protected constructor by injecting accessibility through java reflection
 */

class CProtected protected constructor ( ) { }
class CPrivate private constructor ( ) { }

fun main ( argv : Array <String> ) {
	var cProtected = CProtected::class.java
	var con = cProtected.getDeclaredConstructors ( ) [ 0 ]

	try {
		// try to call protected construct
		println ( con.newInstance ( ) )
	} catch ( e : Exception ) {
		e.printStackTrace ( )
	}

	// set to accessible constructor
	con.setAccessible ( true )

	println ( con.newInstance ( ) )

	val cPrivate = CPrivate::class.java
	con = cPrivate.getDeclaredConstructors ( ) [ 0 ]

	try {
		// try to call private construct
		println ( con.newInstance ( ) )
	} catch ( e : Exception ) {
		e.printStackTrace ( )
	}

	// set to accessible constructor
	con.setAccessible ( true )

	println ( con.newInstance ( ) )
}
