package syntax.javaCollections

// In Kotlin Java standard collections are used, but there are two views on them:
// mutable and readonly

fun useReadonlySet(set: Set<Int>) {
    // doesn't compile:
//    set.add(1)
}

fun useMutableSet(set: MutableSet<Int>) {
    set.add(1)
}

// Readonly collections are covariant

