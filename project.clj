(defproject tech.hello "0.1.0-SNAPSHOT"
  :description "A \"Hello, World!\" webapp from the TechAscent ecosystem."
  :url "http://github.com/techascent/tech.hello"
  :license {:name "Copyright © 2019 TechAscent, LLC."
            :url "http://techascent.com"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [http-kit "2.3.0"]]
  :main ^:skip-aot tech.hello
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :uberjar-name "tech.hello.jar")
