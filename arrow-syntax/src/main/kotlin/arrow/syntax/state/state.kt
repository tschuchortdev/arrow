package arrow.syntax.state

import arrow.core.Tuple2


/**
 * extracts the final state of a monadic computation in `State` out of the returned `Tuple2`
 *
 * @param S type of the state
 * @param A type of the returned value
 */
inline val <S,A> Tuple2<S,A>.state: S get() = this.a

/**
 * extracts the returned value of a monadic computation in `State` out of the returned `Tuple2`
 *
 * @param S type of the state
 * @param A type of the returned value
 */
inline val <S,A> Tuple2<S,A>.value: A get() = this.b

/**
 * convenience function to construct the result tuple of a `State` computation
 * useful when you want to have named parameters for more readability
 *
 * @param S type of the state
 * @param A type of the returned value
 * @param newState resulting state of the computation
 * @param value returned value of the computation
 */
@SuppressWarnings("FunctionName")
inline fun <S, A> StateResult(newState: S, value: A) = Tuple2(newState, value)