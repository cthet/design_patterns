import * as readline from 'readline';
import { Tea } from './Tea';
import { Coffee } from './Coffee';
import { BeverageProductionTemplate } from './BeverageProductionTemplate';

function main() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question('\nChoose your beverage:\n1 - Coffee\n2 - Tea\n', (beverageInput) => {
        const beverageChoice = parseInt(beverageInput);

        rl.question('\nDo you want condiments?:\n1 - Yes\n2 - No\n', (condimentInput) => {
            const condimentChoice = parseInt(condimentInput);

            let beverage: BeverageProductionTemplate;
            if (beverageChoice === 1) {
                beverage = new Coffee();
            } else if (beverageChoice === 2) {
                beverage = new Tea();
            } else {
                console.log('Invalid beverage choice');
                rl.close();
                return;
            }

            if (condimentChoice === 1) {
                beverage.setCustomerWantsCondiments(true);
            }

            beverage.prepareBeverage();
            rl.close();
        });
    });
}

main();