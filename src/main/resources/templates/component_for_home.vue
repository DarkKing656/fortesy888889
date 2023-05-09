<template>
<div id="link-blocks">
<link-blocks :links="links"></link-blocks>
</div>
</template>
<script>
import LinkBlocks from '@/LinkBlock.vue'

export default {
    name:'LinkDone',
    data() {
        return {
            links: [
                {
                    title: 'Главная',
                    href: '/',
                    description: 'Главная страница'
                },
                {
                    title: 'Курятники',
                    href: '/gcheak',
                    description: 'Страница отображения всех курятников'
                },
                {
                    title: 'Курицы',
                    href: '/gpagecheak',
                    description: 'страница отбражения всех куриц'
                },
                {
                    title: 'Яйца',
                    href:'/gegg',
                    description: 'Страница отображения всех яиц'

                },
                {
                    title:'Добавить Курятник',
                    href:'/gcheak/add',
                    description: 'Добавление курятника в базу'
                },
                {
                    title: 'Добавить Курицу',
                    href: '/gpagecheak/add',
                    description: 'Добавление курицы в базу'
                }
            ]
        }
    },
    components: {
        LinkBlocks
    }
}
</script>