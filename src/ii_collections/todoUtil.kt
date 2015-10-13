package ii_collections

import util.TODO

fun todoCollectionTask() = TODO(
        """
           Task for working with collections.
           Look through the 'Shop' API; all tasks are connected with it.
           Return what is described in the name and the comment.

        """,
        references = { shop: Shop -> shop.customers }
)
