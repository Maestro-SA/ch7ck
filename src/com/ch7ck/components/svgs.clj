(ns com.ch7ck.components.svgs)


(defn lisp []
  [:img {:src "/img/lisp.svg"}])

(defn collaboration []
  [:img {:src "/img/collaboration.svg"}])

(defn mentorship []
  [:img {:src "/img/mentorship.svg"}])

(defn code []
  [:img {:src "/img/code.svg"}])

(defn clojure []
  [:img {:src "/img/clojure.svg"}])

(defn clojurescript []
  [:img {:src "/img/clojurescript.svg"}])

(defn google-cloud []
  [:img {:src "/img/google-cloud.svg"}])

(defn laptop-code []
  [:svg
   {:class "w-6 h-6",
    :viewBox "0 0 640 512",
    :xmlns "http://www.w3.org/2000/svg"} 
   [:path
    {:d "M64 96c0-35.3 28.7-64 64-64H512c35.3 0 64 28.7 64 64V352H512V96H128V352H64V96zM0 403.2C0 392.6 8.6 384 19.2 384H620.8c10.6 0 19.2 8.6 19.2 19.2c0 42.4-34.4 76.8-76.8 76.8H76.8C34.4 480 0 445.6 0 403.2zM281 209l-31 31 31 31c9.4 9.4 9.4 24.6 0 33.9s-24.6 9.4-33.9 0l-48-48c-9.4-9.4-9.4-24.6 0-33.9l48-48c9.4-9.4 24.6-9.4 33.9 0s9.4 24.6 0 33.9zM393 175l48 48c9.4 9.4 9.4 24.6 0 33.9l-48 48c-9.4 9.4-24.6 9.4-33.9 0s-9.4-24.6 0-33.9l31-31-31-31c-9.4-9.4-9.4-24.6 0-33.9s24.6-9.4 33.9 0z"}]])

(defn frontend []
  [:svg
   {:class "w-6 h-6",
    :viewBox "0 0 512 512",
    :xmlns "http://www.w3.org/2000/svg"} 
   [:path
    {:d "M480 32l-64 368-223.3 80L0 400l19.6-94.8h82l-8 40.6L210 390.2l134.1-44.4 18.8-97.1H29.5l16-82h333.7l10.5-52.7H56.3l16.3-82H480z"}]])

(defn backend []
  [:svg
   {:class "w-6 h-6",
    :viewBox "0 0 384 512",
    :xmlns "http://www.w3.org/2000/svg"} 
   [:path
    {:d "M64 464c-8.8 0-16-7.2-16-16V64c0-8.8 7.2-16 16-16H224v80c0 17.7 14.3 32 32 32h80V448c0 8.8-7.2 16-16 16H64zM64 0C28.7 0 0 28.7 0 64V448c0 35.3 28.7 64 64 64H320c35.3 0 64-28.7 64-64V154.5c0-17-6.7-33.3-18.7-45.3L274.7 18.7C262.7 6.7 246.5 0 229.5 0H64zm97 289c9.4-9.4 9.4-24.6 0-33.9s-24.6-9.4-33.9 0L79 303c-9.4 9.4-9.4 24.6 0 33.9l48 48c9.4 9.4 24.6 9.4 33.9 0s9.4-24.6 0-33.9l-31-31 31-31zM257 255c-9.4-9.4-24.6-9.4-33.9 0s-9.4 24.6 0 33.9l31 31-31 31c-9.4 9.4-9.4 24.6 0 33.9s24.6 9.4 33.9 0l48-48c9.4-9.4 9.4-24.6 0-33.9l-48-48z"}]])

(defn cloud []
  [:svg
   {:class "w-6 h-6",
    :viewBox "0 0 448 512",
    :xmlns "http://www.w3.org/2000/svg"} 
   [:path
    {:d "M80 104a24 24 0 1 0 0-48 24 24 0 1 0 0 48zm80-24c0 32.8-19.7 61-48 73.3v87.8c18.8-10.9 40.7-17.1 64-17.1h96c35.3 0 64-28.7 64-64v-6.7C307.7 141 288 112.8 288 80c0-44.2 35.8-80 80-80s80 35.8 80 80c0 32.8-19.7 61-48 73.3V160c0 70.7-57.3 128-128 128H176c-35.3 0-64 28.7-64 64v6.7c28.3 12.3 48 40.5 48 73.3c0 44.2-35.8 80-80 80s-80-35.8-80-80c0-32.8 19.7-61 48-73.3V352 153.3C19.7 141 0 112.8 0 80C0 35.8 35.8 0 80 0s80 35.8 80 80zm232 0a24 24 0 1 0 -48 0 24 24 0 1 0 48 0zM80 456a24 24 0 1 0 0-48 24 24 0 1 0 0 48z"}]])

(defn lightning []
  [:svg
   {:class "w-5 h-5 mt-px text-gray-800",
    :stroke "currentColor",
    :viewBox "0 0 52 52"}
   [:polygon
    {:stroke-width "4",
     :stroke-linecap "round",
     :stroke-linejoin "round",
     :fill "none",
     :points "29 13 14 29 25 29 23 39 38 23 27 23"}]])

(defn arrow []
  [:svg
   {:class "w-4 h-4 ml-2",
    :viewBox "0 0 24 24",
    :stroke "currentColor",
    :stroke-width "2",
    :fill "none",
    :stroke-linecap "round",
    :stroke-linejoin "round"}
   [:path {:d "M5 12h14"}]
   [:path {:d "M12 5l7 7-7 7"}]])

(defn email []
  [:svg
   {:xmlns "http://www.w3.org/2000/svg",
    :fill "none",
    :viewBox "0 0 24 24",
    :stroke-width "1.5",
    :stroke "currentColor",
    :class "w-6 h-6"}
   [:path
    {:stroke-linecap "round",
     :stroke-linejoin "round",
     :d
     "M21.75 6.75v10.5a2.25 2.25 0 01-2.25 2.25h-15a2.25 2.25 0 01-2.25-2.25V6.75m19.5 0A2.25 2.25 0 0019.5 4.5h-15a2.25 2.25 0 00-2.25 2.25m19.5 0v.243a2.25 2.25 0 01-1.07 1.916l-7.5 4.615a2.25 2.25 0 01-2.36 0L3.32 8.91a2.25 2.25 0 01-1.07-1.916V6.75"}]])

(defn phone []
  [:svg
   {:xmlns "http://www.w3.org/2000/svg",
    :fill "none",
    :viewBox "0 0 24 24",
    :stroke-width "1.5",
    :stroke "currentColor",
    :class "w-6 h-6"}
   [:path
    {:stroke-linecap "round",
     :stroke-linejoin "round",
     :d "M2.25 6.75c0 8.284 6.716 15 15 15h2.25a2.25 2.25 0 002.25-2.25v-1.372c0-.516-.351-.966-.852-1.091l-4.423-1.106c-.44-.11-.902.055-1.173.417l-.97 1.293c-.282.376-.769.542-1.21.38a12.035 12.035 0 01-7.143-7.143c-.162-.441.004-.928.38-1.21l1.293-.97c.363-.271.527-.734.417-1.173L6.963 3.102a1.125 1.125 0 00-1.091-.852H4.5A2.25 2.25 0 002.25 4.5v2.25z"}]])

(defn linkedin []
  [:img
   {:src "/img/linkedin.svg"}])