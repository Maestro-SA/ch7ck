(ns com.ch7ck.components.heros)


(defn hero []
  [:div
   {:x-data "{ selectedSlide: 0,  interval: null}"
    :x-init "interval = setInterval(() => { selectedSlide = (selectedSlide + 1) % 4 }, 4000)"
    :class "container flex flex-col px-6 py-4 mx-auto space-y-6 lg:h-[52rem] lg:py-16 lg:flex-row lg:items-center"}
   [:div
    {:class "flex flex-col items-center w-full lg:flex-row lg:w-1/2"}
    [:div
     {:class "flex justify-start order-2 mt-6 lg:mt-0 lg:space-y-3 lg:flex-col"}
     [:button
      {"x-on:click.prevent" "selectedSlide = 0",
       :class "w-4 h-4 mx-2 rounded-full lg:mx-0 focus:outline-none hover:bg-gray-800"
       :x-bind:class "{ 'bg-gray-800': selectedSlide === 0, 'bg-gray-300': selectedSlide !== 0 }"}]
     [:button
      {"x-on:click.prevent" "selectedSlide = 1",
       :class "w-4 h-4 mx-2 rounded-full lg:mx-0 focus:outline-none hover:bg-gray-800"
       :x-bind:class "{ 'bg-gray-800': selectedSlide === 1, 'bg-gray-300': selectedSlide !== 1 }"}]
     [:button
      {"x-on:click.prevent" "selectedSlide = 2",
       :class "w-4 h-4 mx-2 rounded-full lg:mx-0 focus:outline-none hover:bg-gray-800"
       :x-bind:class "{ 'bg-gray-800': selectedSlide === 2, 'bg-gray-300': selectedSlide !== 2 }"}]
     [:button
      {"x-on:click.prevent" "selectedSlide = 3",
       :class "w-4 h-4 mx-2 rounded-full lg:mx-0 focus:outline-none hover:bg-gray-800"
       :x-bind:class "{ 'bg-gray-800': selectedSlide === 3, 'bg-gray-300': selectedSlide !== 3 }"}]]
    [:div
     {:class "max-w-2xl lg:mx-12 lg:order-2"}
     [:h1
      {:class "text-6xl text-gray-800 font-semibold tracking-wide bg-white p-2 lg:text-8xl"}
      "Hi, I'm Stha."]
     [:div
      {:x-bind:class "{ 'hidden': selectedSlide !== 0 }"}
      [:p
       {:class "p-2 mt-4 text-4xl text-gray-200 animate-typing overflow-hidden whitespace-nowrap"}
       "A software engineer."]]
     [:div
      {:x-bind:class "{ 'hidden': selectedSlide !== 1 }"}
      [:p
       {:class "p-2 mt-4 text-4xl text-gray-200 animate-typing overflow-hidden whitespace-nowrap"}
       "A backend engineer."]]
     [:div
      {:x-bind:class "{ 'hidden': selectedSlide !== 2 }"}
      [:p
       {:class "p-2 mt-4 text-4xl text-gray-200 animate-typing overflow-hidden whitespace-nowrap"}
       "A clojurian."]]
     [:div
      {:x-bind:class "{ 'hidden': selectedSlide !== 3 }"}
      [:p
       {:class "p-2 mt-4 text-4xl text-gray-200 animate-typing overflow-hidden whitespace-nowrap"}
       "A human."]]
     [:div
      {:class "mt-6"}
      [:a
       {:href "/about-me",
        :class "px-6 py-2.5 mt-8 text-sm font-medium leading-5 text-center text-white capitalize bg-gray-800 rounded-lg lg:mx-0 lg:w-auto focus:outline-none"}
       "Read more"]]]]
   [:div
    {:class "hidden md:flex items-center justify-center w-full h-[42rem] lg:w-1/2"}
    [:img
     {:class "object-cover w-full h-full max-w-2xl rounded-full",
      :src "https://images.unsplash.com/photo-1588495756505-5437763146dd?q=80&w=2788&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
      :alt "apple keyboard and mouse"}]]])

(defn page-hero [title]
  [:div
   {:class "container flex flex-col px-6 pb-4 mx-auto space-y-6 lg:h-[32rem] lg:py-16 lg:flex-row lg:items-center"}
   [:div
    {:class "flex flex-col items-centre w-full lg:flex-row lg:w-1/2"}
    [:div
     {:class "max-w-2xl lg:mx-12 lg:order-2"}
     [:h1
      {:class "text-6xl text-gray-800 font-semibold tracking-wide bg-white p-2 lg:text-8xl"}
      title]]]])