<template>
    <div>
        <div v-for="link in links" :key="link.url">
            <a :href="link.url">{{ link.title }}</a>
            <p>{{ link.description }}</p>
        </div>
    </div>
</template>

<script>
export default {
    name: 'LinkBlocks',
    props: {
        links: {
            type: Array,
            required: true
        }
    }
}
</script>