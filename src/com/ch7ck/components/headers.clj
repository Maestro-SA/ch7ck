(ns com.ch7ck.components.headers)


(defn navbar []
  [:nav
   {:class "bg-white"}
   [:div
    {:class "container flex flex-col items-center p-6 mx-auto"}
    [:a
     {:href "#", :class "mx-auto"}
     [:img
      {:class "w-auto h-16 sm:h-20",
       :src "/img/logo.png",
       :alt ""}]]
    [:div
     {:class "flex items-center justify-center mt-6 text-gray-800 capitalize"}
     [:a
      {:href "#",
       :class "mx-2 text-gray-800 border-b-2 border-blue-500 sm:mx-6"}
      "home"]
     [:a
      {:href "#",
       :class "mx-2 border-b-2 border-transparent hover:text-gray-800 hover:border-blue-500 sm:mx-6"}
      "features"]
     [:a
      {:href "#",
       :class "mx-2 border-b-2 border-transparent hover:text-gray-800 hover:border-blue-500 sm:mx-6"}
      "pricing"]
     [:a
      {:href "#",
       :class "mx-2 border-b-2 border-transparent hover:text-gray-800 hover:border-blue-500 sm:mx-6"}
      "blog"]
     [:a
      {:href "#",
       :class "mx-2 border-b-2 border-transparent hover:text-gray-800 hover:border-blue-500 sm:mx-6"}
      [:svg
       {:class "w-4 h-4 fill-current",
        :viewBox "0 0 24 24",
        :fill "none",
        :xmlns "http://www.w3.org/2000/svg"}
       [:path
        {:fill-rule "evenodd",
         :clip-rule "evenodd",
         :d "M1 11.9554V12.0446C1.01066 14.7301 1.98363 17.1885 3.59196 19.0931C4.05715 19.6439 4.57549 20.1485 5.13908 20.5987C5.70631 21.0519 6.31937 21.4501 6.97019 21.7853C7.90271 22.2656 8.91275 22.6165 9.97659 22.8143C10.5914 22.9286 11.2243 22.9918 11.8705 22.9993C11.9136 22.9998 11.9567 23 11.9999 23C15.6894 23 18.9547 21.1836 20.9502 18.3962C21.3681 17.8125 21.7303 17.1861 22.0291 16.525C22.6528 15.1448 22.9999 13.613 22.9999 12C22.9999 8.73978 21.5816 5.81084 19.3283 3.79653C18.8064 3.32998 18.2397 2.91249 17.6355 2.55132C15.9873 1.56615 14.0597 1 11.9999 1C11.888 1 11.7764 1.00167 11.6653 1.00499C9.99846 1.05479 8.42477 1.47541 7.0239 2.18719C6.07085 2.67144 5.19779 3.29045 4.42982 4.01914C3.7166 4.69587 3.09401 5.4672 2.58216 6.31302C2.22108 6.90969 1.91511 7.54343 1.6713 8.20718C1.24184 9.37631 1.00523 10.6386 1 11.9554ZM20.4812 15.0186C20.8171 14.075 20.9999 13.0588 20.9999 12C20.9999 9.54265 20.0151 7.31533 18.4186 5.6912C17.5975 7.05399 16.5148 8.18424 15.2668 9.0469C15.7351 10.2626 15.9886 11.5603 16.0045 12.8778C16.7692 13.0484 17.5274 13.304 18.2669 13.6488C19.0741 14.0252 19.8141 14.487 20.4812 15.0186ZM15.8413 14.8954C16.3752 15.0321 16.904 15.22 17.4217 15.4614C18.222 15.8346 18.9417 16.3105 19.5723 16.8661C18.0688 19.2008 15.5151 20.7953 12.5788 20.9817C13.5517 20.0585 14.3709 18.9405 14.972 17.6514C15.3909 16.7531 15.678 15.8272 15.8413 14.8954ZM13.9964 12.6219C13.9583 11.7382 13.7898 10.8684 13.5013 10.0408C10.6887 11.2998 7.36584 11.3765 4.35382 9.97197C4.01251 9.81281 3.68319 9.63837 3.36632 9.44983C3.12787 10.2584 2.99991 11.1142 2.99991 12C2.99991 13.9462 3.61763 15.748 4.6677 17.2203C6.83038 14.1875 10.3685 12.4987 13.9964 12.6219ZM6.047 18.7502C7.77258 16.059 10.7714 14.5382 13.8585 14.6191C13.723 15.3586 13.4919 16.093 13.1594 16.8062C12.3777 18.4825 11.1453 19.805 9.67385 20.6965C8.31043 20.3328 7.07441 19.6569 6.047 18.7502ZM11.9999 3C13.7846 3 15.4479 3.51946 16.847 4.41543C16.2113 5.54838 15.3593 6.4961 14.368 7.23057C13.3472 5.57072 11.8752 4.16433 10.027 3.21692C10.6619 3.07492 11.3222 3 11.9999 3ZM8.80619 4.84582C10.4462 5.61056 11.7474 6.80659 12.6379 8.23588C10.3464 9.24654 7.64722 9.30095 5.19906 8.15936C4.83384 7.98905 4.48541 7.79735 4.15458 7.58645C4.91365 6.24006 6.00929 5.10867 7.32734 4.30645C7.82672 4.44058 8.32138 4.61975 8.80619 4.84582Z",
         :fill "currentColor"}]]]]]])

(defn hero []
  [:div
   {:x-data "{ selectedSlide: 0,  interval: null}"
    :x-init "interval = setInterval(() => { selectedSlide = (selectedSlide + 1) % 4 }, 4000)"
    :class "container flex flex-col px-6 pb-4 mx-auto space-y-6 lg:h-[42rem] lg:py-16 lg:flex-row lg:items-center"}
   [:div
    {:class "flex flex-col items-center w-full lg:flex-row lg:w-1/2"}
    [:div
     {:class
      "flex justify-center order-2 mt-6 lg:mt-0 lg:space-y-3 lg:flex-col"}
     [:button
      {"x-on:click.prevent" "selectedSlide = 0",
       :class "w-4 h-4 mx-2 rounded-full lg:mx-0 focus:outline-none hover:bg-purple-800"
       :x-bind:class "{ 'bg-purple-800': selectedSlide === 0, 'bg-gray-300': selectedSlide !== 0 }"}]
     [:button
      {"x-on:click.prevent" "selectedSlide = 1",
       :class "w-4 h-4 mx-2 rounded-full lg:mx-0 focus:outline-none hover:bg-purple-800"
       :x-bind:class "{ 'bg-purple-800': selectedSlide === 1, 'bg-gray-300': selectedSlide !== 1 }"}]
     [:button
      {"x-on:click.prevent" "selectedSlide = 2",
       :class "w-4 h-4 mx-2 rounded-full lg:mx-0 focus:outline-none hover:bg-purple-800"
       :x-bind:class "{ 'bg-purple-800': selectedSlide === 2, 'bg-gray-300': selectedSlide !== 2 }"}]
     [:button
      {"x-on:click.prevent" "selectedSlide = 3",
       :class "w-4 h-4 mx-2 rounded-full lg:mx-0 focus:outline-none hover:bg-purple-800"
       :x-bind:class "{ 'bg-purple-800': selectedSlide === 3, 'bg-gray-300': selectedSlide !== 3 }"}]]
    [:div
     {:class "max-w-2xl lg:mx-12 lg:order-2"}
     [:h1
      {:class "text-6xl font-semibold tracking-wide text-gray-800 lg:text-8xl"}
      "Hi, I'm Stha."]
     [:div
      {:x-bind:class "{ 'hidden': selectedSlide !== 0 }"}
      [:p
       {:class "pb-4 mt-4 text-4xl text-gray-200 animate-typing overflow-hidden whitespace-nowrap"}
       "A clojurian."]]
     [:div
      {:x-bind:class "{ 'hidden': selectedSlide !== 1 }"}
      [:p
       {:class "pb-4 mt-4 text-4xl text-gray-200 animate-typing overflow-hidden whitespace-nowrap"}
       "A backend engineer."]]
     [:div
      {:x-bind:class "{ 'hidden': selectedSlide !== 2 }"}
      [:p
       {:class "pb-4 mt-4 text-4xl text-gray-200 animate-typing overflow-hidden whitespace-nowrap"}
       "A software engineer."]]
     [:div
      {:x-bind:class "{ 'hidden': selectedSlide !== 3 }"}
      [:p
       {:class "pb-4 mt-4 text-4xl text-gray-200 animate-typing overflow-hidden whitespace-nowrap"}
       "A human."]]
     [:div
      {:class "mt-6"}
      [:a
       {:href "#",
        :class "px-6 py-2.5 mt-8 text-sm font-medium leading-5 text-center text-white capitalize bg-purple-800 rounded-lg lg:mx-0 lg:w-auto focus:outline-none"}
       "Read more"]]]]
   [:div
    {:class "flex items-center justify-center w-full h-[32rem] lg:w-1/2"}
    [:img
     {:class "object-cover w-full h-full max-w-2xl rounded-full",
      :src "https://setting-the-tempo.sfo3.cdn.digitaloceanspaces.com/IMG_8433.jpg",
      :alt "apple watch photo"}]]])

(defn header []
  [:header
   {:class "bg-gradient-to-r from-blue-600 to-purple-600"}
   (navbar)
   (hero)])