package v_collections

fun todoCollectionTask() = util.TODO(
        """
           Task on working with collections.
           Look through 'Shop' API (all tasks are connected with it).
           Return what is described in the name and the comment.

        """,
        references = { shop: Shop -> shop.customers }
)