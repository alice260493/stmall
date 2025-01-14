<template>

    <v-data-table
        :headers="headers"
        :items="searchproduct"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchproductView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchproduct : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchproducts'))

            temp.data._embedded.searchproducts.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchproduct = temp.data._embedded.searchproducts;
        },
        methods: {
        }
    }
</script>

