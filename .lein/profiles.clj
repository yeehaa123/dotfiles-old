{:user {:plugins [[lein-ancient "0.6.10"]
                  [lein-try "0.4.3"]
                  [refactor-nrepl "2.3.1"]
                  [cider/cider-nrepl "0.14.0"]
                  [lein-project-clean "0.1.2"]
                  [lein-pprint "1.1.2"]]}
 :repl {:dependencies [[com.cemerick/piggieback "0.2.2"]
                       [org.clojure/tools.nrepl "0.2.10"]]
        :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}}}
