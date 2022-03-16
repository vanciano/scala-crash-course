import funsets.FunSets.*

val evenLimited: FunSet = i => i % 2 == 0 && i >= 0 && i < 10
val doubled = map(evenLimited, i => i * 2)
printSet(doubled)
