package ii_collections

import util.TODO

fun todoCollectionTask(): Nothing = TODO(
        """
           Common task for working with collections.
           Look through the Shop API, which all the tasks are using.
           Each individual task is described in the function name and the comment.
        """,
        references = { shop: Shop -> shop.customers }
)
