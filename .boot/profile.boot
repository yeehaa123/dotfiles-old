(require 'boot.repl)
(swap! boot.repl/*default-dependencies*
       concat '[[refactor-nrepl "2.0.0"]
                [cider/cider-nrepl "0.10.2"]])

(swap! boot.repl/*default-middleware*
       conj 'cider.nrepl/cider-middleware 'refactor-nrepl.middleware/wrap-refactor)
